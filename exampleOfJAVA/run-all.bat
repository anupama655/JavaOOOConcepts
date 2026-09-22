@echo off
setlocal enabledelayedexpansion
cd /d "%~dp0"

title Java OOP - All 24 Programs
cls

echo ==========================================
echo       JAVA OOP - 24 INDIVIDUAL PROGRAMS
echo ==========================================
echo.

for %%D in (
  "01_What_Is_Java"
  "02_Java_Architecture"
  "03_Basic_Program"
  "04_Data_Types"
  "05_Variables"
  "06_Operators"
  "07_Control_Statements"
  "08_Arrays"
  "09_String"
  "10_Methods"
  "11_Constructors"
  "12_This_Keyword"
  "13_OOP_Concepts"
  "14_Class_and_Object"
  "15_Encapsulation"
  "16_Inheritance"
  "17_Polymorphism"
  "18_Abstraction"
  "19_Interfaces"
  "20_Key_Packages_APIs"
  "21_Exception_Handling"
  "22_Collections_Framework"
  "23_Multithreading"
  "24_Java_Features_Latest"
) do (
  echo ==========================================
  echo Running folder: %%~D
  echo ==========================================
  cd "%%~D"
  javac *.java
  for %%F in (*.java) do (
    set "CLASS_NAME=%%~nF"
    echo Running: !CLASS_NAME!
    java !CLASS_NAME!
  )
  cd ..
  echo.
)

echo ==========================================
echo       ALL 24 PROGRAMS COMPLETED
echo ==========================================
if "%~1"=="/pause" pause
endlocal