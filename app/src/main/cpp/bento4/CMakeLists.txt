cmake_minimum_required(VERSION 3.18)
project(coverart)

# Size optimization flags
set(CMAKE_C_FLAGS_RELEASE "${CMAKE_C_FLAGS_RELEASE} -Os -fvisibility=hidden -ffunction-sections -fdata-sections")
set(CMAKE_CXX_FLAGS_RELEASE "${CMAKE_CXX_FLAGS_RELEASE} -Os -fvisibility=hidden -ffunction-sections -fdata-sections")
set(CMAKE_SHARED_LINKER_FLAGS_RELEASE "${CMAKE_SHARED_LINKER_FLAGS_RELEASE} -Wl,--gc-sections -Wl,--strip-all")

# Enable LTO for release builds (disabled via DISABLE_LTO env var for faster CI)
if(NOT DEFINED ENV{DISABLE_LTO} OR NOT "$ENV{DISABLE_LTO}" STREQUAL "true")
    set(CMAKE_INTERPROCEDURAL_OPTIMIZATION_RELEASE ON)
endif()

# Build Bento4 as static library
set(BUILD_APPS OFF CACHE BOOL "" FORCE)
set(BUILD_SHARED_LIBRARY OFF CACHE BOOL "" FORCE)
add_subdirectory(bento4)

# Our JNI wrapper library
add_library(coverart SHARED
    coverart_jni.cpp
)

target_include_directories(coverart PRIVATE
    ${CMAKE_CURRENT_SOURCE_DIR}/bento4/Source/C++/Core
    ${CMAKE_CURRENT_SOURCE_DIR}/bento4/Source/C++/Codecs
    ${CMAKE_CURRENT_SOURCE_DIR}/bento4/Source/C++/Crypto
    ${CMAKE_CURRENT_SOURCE_DIR}/bento4/Source/C++/MetaData
)

target_link_libraries(coverart
    ap4
    log
)

# Android 15+ 16 KB page-size compatibility: 64-bit ELF LOAD segments must be
# 16 KB-aligned. Set explicitly so the result doesn't depend on the NDK version
# (only NDK r28+ does this by default).
target_link_options(coverart PRIVATE "-Wl,-z,max-page-size=16384")
