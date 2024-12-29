cmake_minimum_required(VERSION 3.22)

project(dummy)

set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_library(${CMAKE_PROJECT_NAME} SHARED 
    main.cpp)
    
find_library(android android)
    
target_link_libraries(${CMAKE_PROJECT_NAME} 
    ${android})
    