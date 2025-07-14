import React, { useState } from 'react';
import axios from 'axios';

const Register = () => {
  const [formData, setFormData] = useState({
    empId: '',
    name: '',
    email: '',
    password: '',
    userName: '',
    roleNames: [],
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData(prev => ({
      ...prev,
      [name]: value
    }));
  };

  const handleRolesChange = (e) => {
    
    setFormData(prev => ({
      ...prev,
      roleNames: e.target.value.split(',').map(role => role.trim())
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post('http://localhost:3001/api/auth/register', {
        ...formData,
        empId: Number(formData.empId),  
      });
      alert('Registered Successfully!');
    } catch (err) {
      console.error('Register Error', err);
      alert('Registration failed.');
    }
  };

  return (
    <div>
      <h2>Register</h2>
      <form onSubmit={handleSubmit}>
        <input type="number" name="empId" value={formData.empId} onChange={handleChange} placeholder="Employee ID" required /><br /><br />
        <input type="text" name="name" value={formData.name} onChange={handleChange} placeholder="Full Name" required /><br /><br />
        <input type="text" name="userName" value={formData.userName} onChange={handleChange} placeholder="Username" required /><br /><br />
        <input type="email" name="email" value={formData.email} onChange={handleChange} placeholder="Email" required /><br /><br />
        <input type="password" name="password" value={formData.password} onChange={handleChange} placeholder="Password" required /><br /><br />
        <input type="text" name="roleNames" onChange={handleRolesChange} placeholder="Roles (comma separated)" /><br /><br />
        <button type="submit">Register</button>
      </form>
    </div>
  );
};

export default Register;
