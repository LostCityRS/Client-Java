@echo off
:: Gradle wrapper with automatic Java version switching

set GRADLE_DIR=%~dp0

:: Auto-detect required Java version from build.gradle and switch if needed
powershell -ExecutionPolicy Bypass -File "%GRADLE_DIR%..\auto-java.ps1" -detectFromGradle -workingDir "%GRADLE_DIR%"

:: Now run the original gradlew with all arguments passed through
"%GRADLE_DIR%gradlew.bat" %*
