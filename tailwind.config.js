/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.html",
    "./src/**/*.js",
    "./src/**/*.jsx",
    "./src/**/*.ts",
    "./src/**/*.tsx",
    "./src/**/*.jsp",
    "./src/**/*.thymeleaf",
    "./src/**/*.vue",
  ],
  theme: {
    extend: {
      colors: {
        primary: {
          light: "#e57373",
          DEFAULT: "#d32f2f",
          dark: "#b71c1c",
        },
        secondary: {
          light: "#ffcccb",
          DEFAULT: "#ffebee",
          dark: "#ffcdd2",
        },
      },
    },
  },
  plugins: [],
};
