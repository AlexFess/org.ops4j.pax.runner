@echo off
SETLOCAL
set _SCRIPTS_=%~dp0

java %JAVA_OPTS% -cp ".;%_SCRIPTS_%;%_SCRIPTS_%\target\pax-runner-1.5.0-SNAPSHOT-jdk14.jar" org.ops4j.pax.runner.Run %1 %2 %3 %4 %5 %6 %7 %8 %9