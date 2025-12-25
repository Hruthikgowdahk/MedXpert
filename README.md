# Digital Prescription

A modern healthcare digitization platform built to streamline prescription management and medical record-keeping in India.

**About (app page):** Once running locally, visit `http://localhost:5173/about` to see the in-app About page.
**Repository:** https://github.com/Hruthikgowdahk/MedXpert

## Tech Stack

### Frontend
- **React 18.3** - Core UI framework with TypeScript support
- **Vite** - Next-generation frontend tooling
- **TailwindCSS** - Utility-first CSS framework for modern web applications
- **Lucide React** - Beautiful, consistent icon system

### State Management & Data Handling
- **Dexie.js** - IndexedDB wrapper for client-side storage
- **Fuse.js** - Lightweight fuzzy-search library
- **jsPDF** - Client-side PDF generation

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
   - Client-side Data Processing
   - Secure Document Generation
   - Privacy-focused Architecture

### Architecture Highlights

1. **Client-Side Processing**
   - All data processing happens locally
   - IndexedDB for persistent storage
   - No server dependencies

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
   - IndexedDB for persistence
   - Predictable data flow

## Getting Started

### Prerequisites

Before you begin, make sure you have the following installed on your system:

1. **Node.js** (Required)
   - Download and install from [https://nodejs.org/](https://nodejs.org/) (LTS version recommended)
   - This also installs `npm` (Node Package Manager)
   - Verify installation by running:
     ```bash
     node --version
     npm --version
     ```

2. **Git** (Required for cloning)
   - Download from [https://git-scm.com/](https://git-scm.com/) (Windows)
   - Usually pre-installed on Mac and Linux
   - Verify installation by running:
     ```bash
     git --version
     ```

### Installation & Setup

Follow these steps to run the project on your laptop:

```bash
# Step 1: Clone the repository
git clone https://github.com/Hruthikgowdahk/MedXpert.git

# Step 2: Navigate to the project directory
cd MedXpert

# Step 3: Install all dependencies
npm install

# Step 4: Start the development server
npm run dev
```

After running `npm run dev`, open your browser and navigate to:
- **Local:** http://localhost:5173 (or the port shown in the terminal)

### Quick Start (All Commands at Once)

For a faster setup, you can run all commands in sequence:

```bash
git clone https://github.com/Hruthikgowdahk/MedXpert.git && cd MedXpert && npm install && npm run dev
```

### Build for Production

To create an optimized production build:

```bash
npm run build
```

The production build will be created in the `dist` folder, ready for deployment.

### Troubleshooting

If you encounter any issues while setting up:

1. **"node is not recognized" or "npm is not recognized"**
   - Make sure Node.js is installed from [nodejs.org](https://nodejs.org/)
   - Restart your terminal/command prompt after installation
   - Verify installation with `node --version` and `npm --version`

2. **"git is not recognized"**
   - Install Git from [git-scm.com](https://git-scm.com/) (Windows) or use `brew install git` (Mac)
   - Git usually comes pre-installed on Mac and Linux

3. **Port 5173 already in use**
   - Vite will automatically try another port (like 5174, 5175, etc.)
   - Check the terminal output for the actual port number
   - Or stop the process using port 5173 and try again

4. **Dependencies installation fails**
   - Make sure you have an internet connection
   - Try deleting `node_modules` folder and `package-lock.json`, then run `npm install` again
   - On Windows, you might need to run PowerShell/Command Prompt as Administrator

5. **"Cannot find module" errors**
   - Make sure you ran `npm install` successfully
   - Delete `node_modules` and `package-lock.json`, then run `npm install` again

### System Requirements

- **Node.js:** Version 16.x or higher (LTS version recommended)
- **npm:** Comes with Node.js (version 7.x or higher)
- **Git:** For cloning the repository (usually pre-installed on Mac/Linux)
- **Modern Browser:** Chrome, Firefox, Edge, or Safari (latest versions)

## Project Structure

```
src/
├── components/         # Reusable UI components
├── pages/             # Page components
├── utils/             # Utility functions
│   ├── db.ts         # Database operations
│   ├── pdf.ts        # PDF generation
│   └── auth.ts       # Authentication logic
├── data/             # Static data
└── types/            # TypeScript type definitions
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