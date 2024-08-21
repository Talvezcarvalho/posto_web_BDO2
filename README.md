# Posto de Saúde Web

This project is a web-based health center management system built with Spring Boot and Tailwind CSS.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Setup](#project-setup)
- [Development](#development)
- [Building for Production](#building-for-production)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)

## Prerequisites

Ensure you have the following installed on your local machine:

- JDK 11 or later
- Maven 3.6+ 
- Node.js 14.17.0 or later
- npm 6+ or later

## Project Setup

1. Clone the repository:
   ```
   git clone <repository-url>
   cd posto_web_BDO2
   ```

2. Install npm dependencies:
   ```
   npm install
   ```

3. Set up Tailwind CSS:
   Ensure you have a `tailwind.config.js` file in your project root with the following content:

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

4. Create a `src/main/resources/static/css/tailwind.css` file with the following content:
   ```css
   @tailwind base;
   @tailwind components;
   @tailwind utilities;
   ```

## Development

To run the application in development mode:

```
npm run dev
```

This command starts both the Spring Boot application and Tailwind CSS watch process concurrently.

- Spring Boot will run on `http://localhost:8080`
- Tailwind CSS will watch for changes and rebuild the CSS file automatically

## Building for Production

To build the application for production:

```
npm run build
```

This command will:
1. Build the Tailwind CSS file
2. Compile the Java code
3. Package the application into a JAR file

The resulting JAR file will be in the `target` directory.

## Project Structure

```
posto_web_BDO2/
├── src/
│   ├── main/
│   │   ├── java/          # Java source files
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       ├── tailwind.css  # Tailwind input file
│   │       │       └── styles.css    # Generated CSS file
│   │       └── templates/ # Thymeleaf templates
│   └── test/              # Test files
├── target/                # Compiled files
├── node_modules/          # Node.js dependencies
├── pom.xml                # Maven configuration
├── package.json           # npm configuration
├── tailwind.config.js     # Tailwind CSS configuration
└── README.md              # This file
```

## Technologies Used

- Spring Boot 2.6.5
- Thymeleaf
- Tailwind CSS
- Maven
- Node.js and npm
- MySQL

For more details on each technology and its configuration, please refer to the respective documentation.