import './App.css';
import axios from 'axios';
import { useEffect, useState } from 'react';

function App() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    axios.get("https://localhost:8080/api/users")
    .then(response => setUsers(response.data))
    .catch(error => console.error("Error fetching users:", error))
  }, [])

  return (
    <>
        <h1>Rent a Buddy</h1>
        <h2>Users</h2>
        <ul>
          {users.map(user => (
            <li key={user.id}>{user.username}</li>
          ))}
        </ul>
    </>
  )
}

export default App;
