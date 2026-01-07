export interface Patient {
  id?: number;
  uhid: string;
  name: string;
  gender: 'male' | 'female' | 'other';
  age: number;
  dateOfBirth: string;
  bloodGroup: string;
  aadhaar: string;
  createdAt: Date;
}

export interface Doctor {
  id?: number;
  name: string;
  email: string;
  doctorId: string;
  department: string;
  role: string;
}

export interface Prescription {
  id?: number;
  uhid: string;
  medicines: Medicine[];
  allergies: string;
  symptoms: string;
  hereditaryDiseases: string;
  doctor: Doctor;
  createdAt: Date;
}

export interface Medicine {
  id: string;
  name: string;
  timing: ('morning' | 'afternoon' | 'evening')[];
  beforeFood: boolean;
  dosage: string;
  days: number;
}
