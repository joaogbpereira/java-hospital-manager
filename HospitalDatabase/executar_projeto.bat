@echo off
title Executar HospitalDatabase
echo Compilando arquivos Java...

javac -d bin src\Main.java src\dao\Conexao.java src\controller\CadastrarPaciente.java src\controller\Lista_prioridade.java

if %errorlevel% neq 0 (
    echo Houve um erro na compilação.
    pause
    exit /b
)

echo.
echo Compilado com sucesso!
echo Executando o programa...

java -cp bin Main

echo.
pause
