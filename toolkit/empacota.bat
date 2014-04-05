echo Empacotando (criando um jar) ...
rd /s /q dist
md dist
jar cvf dist\toolkit.jar -C bin .
rem cvf = cria arquivo
rem dist\toolkit.jar = destino da biblioteca
rem -C bin = seleciona o diretorio bin
rem . = todo o conteudo do diretorio selecionado