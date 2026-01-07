import { Patient, Prescription } from './types';

const API_BASE_URL = 'http://localhost:8080/api';

// Patient functions
export const registerPatient = async (patient: Omit<Patient, 'id' | 'createdAt' | 'uhid'>): Promise<string> => {
  const response = await fetch(`${API_BASE_URL}/patients`, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(patient),
  });
  if (!response.ok) {
    throw new Error('Failed to register patient');
  }
  const newPatient = await response.json();
  return newPatient.uhid;
};

export const getPatientByUHID = async (uhid: string): Promise<Patient | undefined> => {
  const response = await fetch(`${API_BASE_URL}/patients/${uhid}`);
  if (!response.ok) {
    if (response.status === 404) {
      return undefined;
    }
    throw new Error('Failed to get patient');
  }
  return await response.json();
};

export const getPatientByAadhaar = async (aadhaar: string): Promise<Patient | undefined> => {
    const response = await fetch(`${API_BASE_URL}/patients/aadhaar/${aadhaar}`);
    if (!response.ok) {
        if (response.status === 404) {
            return undefined;
        }
        throw new Error('Failed to get patient by Aadhaar');
    }
    return await response.json();
};

// Prescription functions
export const savePrescription = async (prescription: Omit<Prescription, 'id' | 'createdAt'>): Promise<Prescription> => {
  const response = await fetch(`${API_BASE_URL}/prescriptions`, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(prescription),
  });
  if (!response.ok) {
    throw new Error('Failed to save prescription');
  }
  return await response.json();
};

export const getPrescriptionsByUHID = async (uhid: string): Promise<Prescription[]> => {
  const response = await fetch(`${API_BASE_URL}/prescriptions/${uhid}`);
  if (!response.ok) {
    throw new Error('Failed to get prescriptions');
  }
  return await response.json();
};

export const deletePrescription = async (id: number): Promise<void> => {
  const response = await fetch(`${API_BASE_URL}/prescriptions/${id}`, {
    method: 'DELETE',
  });
  if (!response.ok) {
    throw new Error('Failed to delete prescription');
  }
};

// The following functions are not yet migrated to the backend API
// and will need to be updated later.

export const saveRecord = async (record: any): Promise<number> => {
  console.warn('saveRecord is not yet migrated to the backend API');
  return -1; // Replace with API call
};

export const getRecordsByUHID = async (uhid: string): Promise<any[]> => {
  console.warn('getRecordsByUHID is not yet migrated to the backend API');
  return []; // Replace with API call
};

export const deleteRecord = async (id: number): Promise<void> => {
  console.warn('deleteRecord is not yet migrated to the backend API');
  // Replace with API call
};
