# Run All Java Examples Guide

This guide explains how to run every Java program in the repository using the batch file.

## File

- `run-all.bat`

## What it does

The batch script:

1. Enters each numbered Java example folder
2. Compiles all `.java` files in that folder
3. Runs the compiled class file
4. Moves to the next folder
5. Repeats until all examples finish

## How to use it

From the `exampleOfJAVA` folder, run:

```bat
run-all.bat
```

Or from Command Prompt:

```bat
d:\anu\JavaOOOConcepts\exampleOfJAVA\run-all.bat
```

## Notes

- This script expects Java to be installed and available in the system `PATH`.
- If Java is not in `PATH`, you may need to set the JDK path manually.
- The script prints each example folder and its execution output as it runs.

## Example

```bat
@echo off
cd /d "%~dp0"
...
```

This means the script changes to the folder where the batch file is located before execution.

## Related files

- [README.md](README.md)
- [01_What_Is_Java/README.md](01_What_Is_Java/README.md)
- [14_Class_and_Object/README.md](14_Class_and_Object/README.md)
