@echo off
setlocal enabledelayedexpansion

set JAVA_HOME=C:\Program Files\Java\jdk-21
set GRADLE_USER_HOME=%USERPROFILE%\.gradle

REM Create directories
if not exist "%GRADLE_USER_HOME%\wrapper\dists\gradle-8.8-bin" mkdir "%GRADLE_USER_HOME%\wrapper\dists\gradle-8.8-bin"

REM Download Gradle
echo Downloading Gradle 8.8...
powershell -NoProfile -Command "^
  $ProgressPreference = 'SilentlyContinue'; ^
  $url = 'https://services.gradle.org/distributions/gradle-8.8-bin.zip'; ^
  $out = '%GRADLE_USER_HOME%\wrapper\dists\gradle-8.8-bin\gradle-8.8-bin.zip'; ^
  Invoke-WebRequest -Uri $url -OutFile $out; ^
  Write-Host 'Downloaded: ' ((Get-Item $out).Length) ' bytes'
"

if exist "%GRADLE_USER_HOME%\wrapper\dists\gradle-8.8-bin\gradle-8.8-bin.zip" (
  echo Download successful
  REM Extract
  echo Extracting...
  powershell -NoProfile -Command "Expand-Archive -Path '%GRADLE_USER_HOME%\wrapper\dists\gradle-8.8-bin\gradle-8.8-bin.zip' -DestinationPath '%GRADLE_USER_HOME%\wrapper\dists\gradle-8.8-bin' -Force"
  echo Setup complete!
) else (
  echo Download failed
  exit /b 1
)

