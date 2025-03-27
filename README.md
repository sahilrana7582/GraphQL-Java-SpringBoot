# 🎬 Movie and Ticket Booking Microservices Application

## 📝 Project Overview

This comprehensive microservices-based application is designed to provide a robust and scalable solution for movie ticket booking and management. Built using cutting-edge technologies, the project demonstrates modern software architecture and best practices in distributed system design.

![System Architecture](https://i.imgur.com/X7zQg5R.png)

## 🚀 Technology Stack

### Backend Technologies
- **Language**: Java 17
- **Framework**: Spring Boot 3.x
- **API**: GraphQL
- **Service Discovery**: Netflix Eureka
- **Database**: PostgreSQL
- **Microservices Architecture**

### Key Components
- Movie Service
- Ticket Booking Service
- User Management Service
- Discovery Server
- API Gateway

## 🔧 System Architecture

### Microservices Design
Our application leverages a microservices architecture to ensure:
- Independent deployment
- Scalability
- Fault tolerance
- Easy maintenance

![Microservices Architecture](https://i.imgur.com/LQkKHrN.png)

## 📦 Project Modules

### 1. Discovery Server (Eureka)
- Service registration and discovery
- Enables dynamic scaling
- Provides load balancing

### 2. API Gateway
- Single entry point for all services
- Request routing
- Authentication and authorization
- Rate limiting

### 3. Movie Service
- Manages movie-related operations
- GraphQL API for flexible querying
- CRUD operations for movies

### 4. Ticket Booking Service
- Handles ticket reservations
- Seat availability management
- Payment integration

### 5. User Management Service
- User authentication
- Profile management
- Authorization

## 🗂️ Database Design

### PostgreSQL Schema
![Database Schema](https://i.imgur.com/JWX9Kf8.png)

### Key Entities
- Movie
- Theater
- Screen
- Show
- Ticket
- User
- Booking

## 🛠️ Development Setup

### Prerequisites
- Java 17
- Maven
- PostgreSQL
- Docker (Optional)

### Local Development Steps
1. Clone the repository
2. Configure PostgreSQL databases
3. Set up environment variables
4. Run Eureka Discovery Server
5. Start individual microservices

```bash
# Clone Repository
git clone https://github.com/yourusername/movie-ticket-booking-app.git

# Build Project
mvn clean install

# Run Discovery Server
java -jar discovery-server.jar

# Run Individual Services
java -jar movie-service.jar
java -jar booking-service.jar
```

## 🔐 Security Features

### Authentication
- JWT-based authentication
- Role-based access control
- Secure GraphQL endpoints

### Authorization
- User roles (Admin, Customer)
- Granular permission management

## 📊 Performance Optimization

### Caching Strategies
- Redis caching for frequently accessed data
- Ehcache for local service caching

### Database Optimization
- Indexed queries
- Connection pooling
- Query optimization techniques

## 🚀 Deployment

### Containerization
- Docker support
- Docker Compose for local deployment
- Kubernetes ready architecture

### Cloud Ready
- Support for AWS, GCP, Azure
- Scalable microservices deployment

## 🔍 Monitoring & Observability

### Distributed Tracing
- Spring Cloud Sleuth
- Zipkin for trace visualization

### Metrics
- Prometheus
- Grafana dashboards

## 📋 GraphQL API Examples

### Movie Query
```graphql
query {
  getMovieById(id: "123") {
    title
    description
    duration
    shows {
      theater
      timing
      availableSeats
    }
  }
}
```

### Ticket Booking Mutation
```graphql
mutation {
  bookTicket(
    movieId: "123"
    showId: "456"
    seats: ["A1", "A2"]
    userId: "user123"
  ) {
    bookingId
    status
    totalPrice
  }
}
```

## 🤝 Contributing

### Guidelines
1. Fork the repository
2. Create feature branch
3. Commit changes
4. Push to branch
5. Create pull request

## 📄 License
MIT License

## 📞 Contact
- Your Name
- Email: your.email@example.com
- LinkedIn: [Your Profile](https://linkedin.com/in/yourprofile)

## 🌟 Star the Repository!
If you find this project helpful, please give it a star ⭐ on GitHub!

---

### 🚧 Work in Progress
This project is continuously evolving. Contributions and suggestions are welcome!