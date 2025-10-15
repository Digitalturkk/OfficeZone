# OfficeZone 🏢

> A modern office rental application backend built to streamline workspace management and booking

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](CONTRIBUTING.md)

## 📋 Table of Contents

- [About](#about)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Project Structure](#project-structure)
- [Development](#development)
- [Testing](#testing)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## 🎯 About

OfficeZone is a comprehensive backend solution for office rental and workspace management. It provides a robust API for managing office spaces, bookings, user authentication, and payment processing. Whether you're managing coworking spaces, private offices, or meeting rooms, OfficeZone simplifies the entire rental process.

## ✨ Features

- **User Management**
  - User registration and authentication
  - Role-based access control (Admin, Owner, Tenant)
  - Profile management
  
- **Office Space Management**
  - Create and manage office listings
  - Office availability tracking
  - Photo uploads and management
  - Location-based search
  
- **Booking System**
  - Real-time availability checking
  - Flexible booking periods (hourly, daily, monthly)
  - Booking confirmation and notifications
  - Booking history and management
  
- **Payment Integration**
  - Secure payment processing
  - Multiple payment methods
  - Payment history and invoicing
  - Refund management
  
- **Search & Filter**
  - Advanced search functionality
  - Filter by location, price, amenities
  - Sorting options
  
- **Reviews & Ratings**
  - User reviews and ratings
  - Review moderation
  - Average rating calculation

## 🛠️ Technology Stack

- **Runtime Environment**: Node.js
- **Framework**: Express.js
- **Database**: MongoDB with Mongoose ODM
- **Authentication**: JWT (JSON Web Tokens)
- **File Storage**: AWS S3 / Local Storage
- **Payment Processing**: Stripe API
- **Email Service**: SendGrid / Nodemailer
- **API Documentation**: Swagger/OpenAPI
- **Testing**: Jest / Mocha & Chai
- **Code Quality**: ESLint, Prettier

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- Node.js (v14.x or higher)
- npm or yarn package manager
- MongoDB (v4.x or higher)
- Git

### Installation

1. **Clone the repository**

```bash
git clone https://github.com/Digitalturkk/OfficeZone.git
cd OfficeZone
```

2. **Install dependencies**

```bash
npm install
# or
yarn install
```

3. **Set up environment variables**

Create a `.env` file in the root directory:

```env
# Server Configuration
PORT=5000
NODE_ENV=development

# Database
MONGODB_URI=mongodb://localhost:27017/officezone
MONGODB_TEST_URI=mongodb://localhost:27017/officezone-test

# JWT Secret
JWT_SECRET=your_jwt_secret_key_here
JWT_EXPIRE=7d

# Email Configuration
EMAIL_SERVICE=sendgrid
EMAIL_API_KEY=your_email_api_key
EMAIL_FROM=noreply@officezone.com

# File Upload
MAX_FILE_SIZE=5242880
FILE_UPLOAD_PATH=./public/uploads

# AWS S3 (if using cloud storage)
AWS_ACCESS_KEY_ID=your_aws_access_key
AWS_SECRET_ACCESS_KEY=your_aws_secret_key
AWS_BUCKET_NAME=your_bucket_name
AWS_REGION=us-east-1

# Payment Gateway
STRIPE_SECRET_KEY=your_stripe_secret_key
STRIPE_PUBLISHABLE_KEY=your_stripe_publishable_key

# Frontend URL
FRONTEND_URL=http://localhost:3000
```

4. **Database setup**

Make sure MongoDB is running:

```bash
# For local MongoDB
mongod

# Or use Docker
docker run -d -p 27017:27017 --name mongodb mongo:latest
```

### Configuration

Additional configuration options can be found in the `config/` directory. Modify these files according to your environment:

- `config/db.js` - Database connection settings
- `config/auth.js` - Authentication configuration
- `config/upload.js` - File upload settings

## 💻 Usage

### Development Mode

```bash
npm run dev
# or
yarn dev
```

The server will start on `http://localhost:5000` (or the PORT specified in your `.env` file).

### Production Mode

```bash
npm start
# or
yarn start
```

## 📚 API Documentation

### Base URL

```
http://localhost:5000/api/v1
```

### Authentication

Most endpoints require authentication. Include the JWT token in the Authorization header:

```
Authorization: Bearer <your_token>
```

### Main Endpoints

#### Authentication
- `POST /api/v1/auth/register` - Register a new user
- `POST /api/v1/auth/login` - Login user
- `GET /api/v1/auth/me` - Get current user
- `PUT /api/v1/auth/updatedetails` - Update user details
- `PUT /api/v1/auth/updatepassword` - Update password
- `POST /api/v1/auth/forgotpassword` - Request password reset
- `PUT /api/v1/auth/resetpassword/:resettoken` - Reset password

#### Offices
- `GET /api/v1/offices` - Get all offices
- `GET /api/v1/offices/:id` - Get single office
- `POST /api/v1/offices` - Create new office (Auth required)
- `PUT /api/v1/offices/:id` - Update office (Auth required)
- `DELETE /api/v1/offices/:id` - Delete office (Auth required)
- `GET /api/v1/offices/radius/:zipcode/:distance` - Get offices within radius

#### Bookings
- `GET /api/v1/bookings` - Get all bookings
- `GET /api/v1/bookings/:id` - Get single booking
- `POST /api/v1/offices/:officeId/bookings` - Create booking (Auth required)
- `PUT /api/v1/bookings/:id` - Update booking (Auth required)
- `DELETE /api/v1/bookings/:id` - Cancel booking (Auth required)

#### Reviews
- `GET /api/v1/offices/:officeId/reviews` - Get reviews for office
- `POST /api/v1/offices/:officeId/reviews` - Add review (Auth required)
- `PUT /api/v1/reviews/:id` - Update review (Auth required)
- `DELETE /api/v1/reviews/:id` - Delete review (Auth required)

For detailed API documentation, visit `/api-docs` when the server is running (Swagger UI).

## 📁 Project Structure

```
OfficeZone/
├── config/              # Configuration files
│   ├── db.js           # Database configuration
│   ├── auth.js         # Authentication config
│   └── ...
├── controllers/         # Route controllers
│   ├── auth.js
│   ├── offices.js
│   ├── bookings.js
│   └── ...
├── models/             # Database models
│   ├── User.js
│   ├── Office.js
│   ├── Booking.js
│   └── ...
├── routes/             # API routes
│   ├── auth.js
│   ├── offices.js
│   ├── bookings.js
│   └── ...
├── middleware/         # Custom middleware
│   ├── auth.js
│   ├── error.js
│   ├── async.js
│   └── ...
├── utils/              # Utility functions
│   ├── errorResponse.js
│   ├── sendEmail.js
│   └── ...
├── public/             # Static files
│   └── uploads/        # Uploaded files
├── tests/              # Test files
│   ├── unit/
│   └── integration/
├── .env.example        # Environment variables example
├── .gitignore
├── package.json
├── server.js           # Entry point
└── README.md
```

## 🔧 Development

### Code Style

This project uses ESLint and Prettier for code formatting. Run the following commands:

```bash
# Lint code
npm run lint

# Fix linting issues
npm run lint:fix

# Format code
npm run format
```

### Pre-commit Hooks

We use Husky for Git hooks to ensure code quality:

```bash
npm run prepare
```

## 🧪 Testing

### Run all tests

```bash
npm test
```

### Run specific test suites

```bash
# Unit tests
npm run test:unit

# Integration tests
npm run test:integration

# Test coverage
npm run test:coverage
```

### Test Structure

- Unit tests: Test individual functions and modules
- Integration tests: Test API endpoints and database interactions
- E2E tests: Test complete user workflows

## 🚢 Deployment

### Deploy to Heroku

1. Create a Heroku app:

```bash
heroku create your-app-name
```

2. Add MongoDB addon:

```bash
heroku addons:create mongolab:sandbox
```

3. Set environment variables:

```bash
heroku config:set NODE_ENV=production
heroku config:set JWT_SECRET=your_secret
# Set other environment variables
```

4. Deploy:

```bash
git push heroku main
```

### Deploy to AWS/DigitalOcean

Refer to the detailed deployment guide in the `docs/deployment.md` file.

### Docker Deployment

```bash
# Build image
docker build -t officezone-backend .

# Run container
docker run -p 5000:5000 --env-file .env officezone-backend
```

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

Please make sure to:
- Follow the existing code style
- Write/update tests for your changes
- Update documentation as needed
- Follow the [Code of Conduct](CODE_OF_CONDUCT.md)

For more details, see [CONTRIBUTING.md](CONTRIBUTING.md)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Contact

**Project Maintainer**: Digitalturkk

- GitHub: [@Digitalturkk](https://github.com/Digitalturkk)
- Project Link: [https://github.com/Digitalturkk/OfficeZone](https://github.com/Digitalturkk/OfficeZone)

## 🙏 Acknowledgments

- Thanks to all contributors who have helped shape this project
- Inspired by the need for better workspace management solutions
- Built with love for the coworking community

---

⭐ If you find this project helpful, please consider giving it a star on GitHub!
