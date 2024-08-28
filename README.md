# Posto de Saúde Web

Este projeto é um sistema de gestão de centro de saúde baseado na web, construído com Spring Boot e Tailwind CSS.

## Índice

- [Pré-requisitos](#pré-requisitos)
- [Configuração do Projeto](#configuração-do-projeto)
- [Desenvolvimento](#desenvolvimento)
- [Construção para Produção](#construção-para-produção)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)

## Pré-requisitos

Certifique-se de ter os seguintes itens instalados na sua máquina local:

- JDK 11 ou superior
- Maven 3.6+
- Node.js 14.17.0 ou superior
- npm 6+ ou superior

## Configuração do Projeto

1. Clone o repositório:
   ```
   git clone <url-do-repositório>
   cd posto_web_BDO2
   ```

2. Instale as dependências do npm:
   ```
   npm install
   ```

3. Configure o Tailwind CSS:
   Certifique-se de ter um arquivo `tailwind.config.js` na raiz do seu projeto com o seguinte conteúdo:

   ```javascript
   module.exports = {
     content: [
       './src/**/*.html',
       './src/**/*.js',
       './src/**/*.jsx',
       './src/**/*.ts',
       './src/**/*.tsx',
       './src/**/*.jsp',
       './src/**/*.thymeleaf',
       './src/**/*.vue',
     ],
     theme: {
       extend: {
         colors: {
           primary: {
             light: '#e57373',
             DEFAULT: '#d32f2f',
             dark: '#b71c1c',
           },
           secondary: {
             light: '#ffcccb',
             DEFAULT: '#ffebee',
             dark: '#ffcdd2',
           },
         },
       },
     },
     plugins: [],
   }
   ```

4. Crie um arquivo `src/main/resources/static/css/tailwind.css` com o seguinte conteúdo:
   ```css
   @tailwind base;
   @tailwind components;
   @tailwind utilities;
   ```

## Desenvolvimento

Para rodar a aplicação em modo de desenvolvimento:

```
npm run dev
```

Este comando inicia tanto a aplicação Spring Boot quanto o processo de monitoramento do Tailwind CSS simultaneamente.

- O Spring Boot será executado em `http://localhost:8080`
- O Tailwind CSS irá monitorar alterações e reconstruir o arquivo CSS automaticamente

## Construção para Produção

Para construir a aplicação para produção:

```
npm run build
```

Este comando irá:
1. Construir o arquivo CSS do Tailwind
2. Compilar o código Java
3. Empacotar a aplicação em um arquivo JAR

O arquivo JAR resultante estará no diretório `target`.

## Estrutura do Projeto

```
posto_web_BDO2/
├── src/
│   ├── main/
│   │   ├── java/          # Arquivos fonte Java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       ├── tailwind.css  # Arquivo de entrada do Tailwind
│   │       │       └── styles.css    # Arquivo CSS gerado
│   │       └── templates/ # Templates Thymeleaf
│   └── test/              # Arquivos de teste
├── target/                # Arquivos compilados
├── node_modules/          # Dependências do Node.js
├── pom.xml                # Configuração do Maven
├── package.json           # Configuração do npm
├── tailwind.config.js     # Configuração do Tailwind CSS
└── README.md              # Este arquivo
```

## Tecnologias Utilizadas

- Spring Boot 2.6.5
- Thymeleaf
- Tailwind CSS
- Maven
- Node.js e npm
- Postgres

Para mais detalhes sobre cada tecnologia e sua configuração, consulte a documentação respectiva.