# Servlets
Introdução ao uso de Servlets e JSP com gerenciamento Gradle

--Automatização de Deploy utilizando task gradle

# Configuração do ambiente

# GIT
Se seu computador não vier com o Git instalado por padrão, copie e cole os seguintes comandos em um terminal: sudo apt-get update sudo apt-get install git
Por fim, execute o comando git version para verificar se a instalação foi feita com sucesso. Se sim, verá no terminal uma saída como essa: git version 2.25.1

# SDKMAN
O SDKMAN é um projeto open source que facilita muito na hora de fazer instalações do Java, Gradle, Groovy, entre muitos outros frameworks e linguagens afins que ele oferece. Nós recomendamos que ele seja utilizado para a instalação do Gradle, pois garante facilidade na hora de baixar novas versões e alterar as mesmas quando necessário.

Para instalar, siga os passos seguintes:
1 - Abra um novo terminal, copie e cole o comando abaixo e aperte ENTER $ curl -s "https://get.sdkman.io" | bash Siga as instruções na tela para completar a instalação.
2 - Abra um novo terminal novamente, copie e cole o comando abaixo e aperte ENTER $ source "$HOME/.sdkman/bin/sdkman-init.sh"
3 - Por último, digite o comando abaixo para ter certeza de que tudo deu certo $ sdk version OBS: Se for exibido a versão do SDKMAN instalado, a instalação ocorreu perfeitamente. Caso algo tenha dado errado, siga as instruções no próprio site: http://sdkman.io/install.html
4 - Com o SDKMAN instalado, siga os passos seguintes para efetuar a instalação do Gradle.

# GRADLE
Para instalar o Gradle, siga os passos abaixo;
sdkman list gradle (isso irá listar todas versões disponiveis)

Ao escolher a versão desejada, digite no seu terminal o seguinte comando:
sdk install gradle 7.2

Caso tenha mais de uma versã oinstalada, voce pode selecionar qual desejar usando o comando abaixo informando a versão;
sdk use gradle 4.4

para consultar se o gradle esta instalado corretamente e qual a versão digite o comando
gradle --version

# JAVA
A instalação do JAVA segue o mesmo passo da instalação do gradle;

Com o SDKMAN instalado, digite os comando apara instalar o JAVA desejado;
sdk list java

Escolha a versão desejada, com base na versão do gradle instalado acima e digite
sdk install java 8.0.372-sem

Para alterar entre as versões de java instalado, basta seguir conforme o exemplo do gradle acima.

Para saber se o java foi instalado com sucesso e qual sua versão, basta digitar:
java -version

Informar o ubuntu onde o JDK e o JRE estão instalados:
sudo update-alternatives --install "/usr/bin/java" "java" "/home/giovane/.sdkman/candidates/java/current/bin/java" 1
sudo update-alternatives --install "/usr/bin/javac" "javac" "/home/giovane/.sdkman/candidates/java/current/bin/javac" 1
sudo update-alternatives --install "/usr/bin/javaws" "javaws" "/home/giovane/.sdkman/candidates/java/current/bin/javaws" 1


*obs*
Tanto o GRADLE quanto o JAVA, são instalados na pasta 'candidates' (dentro do diretório de instalação do sdkman conforme definido na instalação).

# WILDFLY
Utilizaremos o servidor de aplicação Wildfly
Para obter o Wildfly (Jboss) é fácil, basta procurar o site e fazer o download, usaremos a versão wildfly-10.1.0.Final (caso já o tenha em algum ambiente pode ser feito uma copia e ajustar as configurações) caso contrário será necessário configura-lo.

OBS: É recomendado que você salve o servidor na pasta /opt do sistema.

# INTELLIJ COMMUNITY
Para baixar o IntelliJ Community, entre neste link e baixe a última versão disponível: https://www.jetbrains.com/idea/download/#section=linux
Ou se Ubuntu, acesse a app store e procure por Intelij IDEA Comunity Edition

*obs*
Algumas instalações do Intelij, podem não reconhecer o GRADLE instalado, e então pegar a versão que o intellij disponibiliza.
Se for ocaso, entre em file>project structure> model
Remova o model listado e import novamente, certificando de que dentro da pasta do projeto se encontre a versã o gradle desejada.sdkman

Em setings, no intellij verifique se o caminho do local de instalação do gradle esta configurado corretamente;
exe: ~/.sdkman/candidates/gradle/current

Dentro do Intellij, via terminal, é possivel rodar comandos gradle (tasks), porem pode haver um pequendo problema onde não se reconhece a instalação do java ou do gradle.
Ao digitar gradle --version ou java -version aparece a mensagem informando que não esta instalado, porem em qualquer sessã odo terminal linux vimos que foi instalado.
Para resolver isso basta logar como super usuario no terminal do intellij.
Ex:
sudo su seuUser

