# Digital Prescription

A modern healthcare digitization platform built to streamline prescription management and medical record-keeping in India.

## Tech Stack

### Frontend
- **React 18.3** - Core UI framework with TypeScript support
- **Vite** - Next-generation frontend tooling
- **TailwindCSS** - Utility-first CSS framework for modern web applications
- **Lucide React** - Beautiful, consistent icon system

### Backend
- **Spring Boot 3.1.5** - Java-based framework for building web applications
- **Spring Data JPA** - For data access and persistence
- **PostgreSQL** - Open-source relational database
- **Maven** - Dependency management

### Data Handling
- **Fuse.js** - Lightweight fuzzy-search library

### AI & Recognition Features
- **Tesseract.js** - OCR (Optical Character Recognition) for handwriting recognition
- **Custom Handwriting Recognition** - Enhanced medicine name recognition with fuzzy matching
- **Web Speech API** - Voice input for medicine search

### Development Tools
- **TypeScript** - Static typing and enhanced developer experience
- **ESLint** - Code quality and consistency
- **PostCSS** - CSS processing and optimization

### Key Features

1. **Multi-User System**
   - Doctor Dashboard
   - Patient Portal
   - Medical Store Interface

2. **Digital Prescription Management**
   - Handwriting Recognition for Medicine Names
   - Voice Input Support
   - PDF Generation
   - Digital Signature Support

3. **Patient Management**
   - UHID (Unique Health ID) System
   - Medical History Tracking
   - Record Management

4. **Security & Privacy**
   - Secure data transmission between client and server
   - Secure Document Generation
   - Privacy-focused Architecture

### Architecture Highlights

1. **Client-Server Architecture**
   - The frontend is a single-page application built with React.
   - The backend is a RESTful API built with Spring Boot.
   - Data is stored in a PostgreSQL database.

2. **Modular Component Design**
   - Reusable UI components
   - Separation of concerns
   - Component-based architecture

3. **Intelligent Medicine Recognition**
   - Multi-stage recognition pipeline
   - Fuzzy matching algorithms
   - Fallback suggestions

4. **Responsive Design**
   - Mobile-first approach
   - Adaptive UI components
   - Cross-device compatibility

### Performance Features

1. **Optimized Bundle Size**
   - Code splitting
   - Dynamic imports
   - Tree shaking

2. **Fast Development Experience**
   - Hot Module Replacement (HMR)
   - Fast refresh
   - Instant feedback

3. **Enhanced User Experience**
   - Smooth animations
   - Instant feedback
   - Progressive enhancement

### Development Practices

1. **Code Quality**
   - TypeScript for type safety
   - ESLint for code quality
   - Consistent code style

2. **Component Architecture**
   - Atomic design principles
   - Reusable components
   - Clear separation of concerns

3. **State Management**
   - Local state with React hooks
   - Centralized API logic for data fetching
   - Predictable data flow

## Getting Started

### Frontend
```bash
# Clone the repository
git clone [repository-url]

# Install dependencies
npm install

# Start development server
npm run dev

# Build for production
npm run build
```

### Backend
```bash
# Navigate to the backend directory
cd digital-prescription-backend

# Run the application
mvn spring-boot:run
```

## Project Structure

### Frontend
```
src/
├── components/         # Reusable UI components
├── pages/             # Page components
├── utils/             # Utility functions
│   ├── db.ts         # Backend API communication
│   ├── pdf.ts        # (Legacy) PDF generation utilities
│   └── auth.ts       # Authentication logic
├── data/             # Static data
└── types/            # TypeScript type definitions
```
### Backend
```
src/main/java/com/example/digitalprescriptionbackend/
├── controller/       # REST API controllers
├── dto/              # Data Transfer Objects
├── model/            # JPA entities
├── repository/       # Spring Data JPA repositories
└── service/          # Business logic
```

## Future Enhancements

1. **Integration Capabilities**
   - HL7/FHIR support
   - EMR/EHR system integration
   - Health information exchange

2. **Advanced Features**
   - Machine learning for better recognition
   - Real-time collaboration
   - Advanced analytics

3. **Compliance & Standards**
   - HIPAA compliance readiness
   - HL7 compatibility
   - International healthcare standards

## Contributing

Contributions are welcome! Please read our contributing guidelines and code of conduct.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
