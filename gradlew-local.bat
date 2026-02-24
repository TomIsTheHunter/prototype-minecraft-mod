@echo off
setlocal enabledelayedexpansion

REM Use the extracted Gradle directly
set GRADLE_HOME=%USERPROFILE%\.gradle\wrapper\dists\gradle-8.8-bin\dl7vupf4psengwqhwktix4v1\gradle-8.8
set JAVA_HOME=C:\Program Files\Java\jdk-21

"%GRADLE_HOME%\bin\gradle.bat" %*

