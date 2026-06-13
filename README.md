# DevOps Exam: Automated Infrastructure & CI/CD Pipeline

Реализация лабораторной работы по развертыванию контейнеризированных веб-приложений с автоматизированным CI/CD циклом.

## 🛠️ Стек технологий
- **Приложения**: Java (встроенный HttpServer) и Python (Flask).
- **Контейнеризация**: Docker, Docker Compose (Multi-stage сборка для Java).
- **CI/CD & Code Quality**: GitHub Actions, Flake8.
- **Безопасность (DevSecOps)**: Snyk Security Scan.
- **Registry**: GitHub Container Registry (GHCR).
- **Уведомления**: Telegram Bot API.

## 🚀 Локальный запуск
Для запуска всей инфраструктуры в локальном окружении выполните:
```bash
docker compose up --build
```
После запуска приложения будут доступны по адресам:
- Java App: [http://localhost:8080](http://localhost:8080) -> Вывод: `Hello World 1`
- Python App: [http://localhost:5000](http://localhost:5000) -> Вывод: `Hello World 2`

## 🧪 Запуск тестов локально
**Java**: `cd app1-java && mvn test`  
**Python**: `cd app2-python && python -m unittest test_app.py`

## 🔄 Описание CI/CD Пайплайна
Пайплайн описан в коде (`.github/workflows/ci-cd.yml`) и состоит из 4 этапов:
1. **Test-and-Lint**: Параллельный запуск тестов JUnit/Unittest и проверка синтаксиса Python линтером Flake8.
2. **Security-Scan**: Статический анализ кода и зависимостей на уязвимости с помощью Snyk.
3. **Build-and-Push**: Сборка легковесных Docker-образов и публикация в GHCR при пуше в ветку `main`.
4. **Notify**: Отправка отчета о статусе выполнения пайплайна в Telegram.