import { useState } from "react";
import axios from "axios";

const SignUp = () => {
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [userName, setUserName] = useState("");
    const [roleName, setRoleName] = useState("");

    async function addNewEmployee(event) {
        event.preventDefault();
            const roleArray = roleName.split(",").map(role => role.trim());
            const req = await axios.post("https://springboot-deploy-vk.onrender.com/api/auth/register", {
                name,
                email,
                password,
                userName,
                roleName: roleArray
            });
            console.log(req);  
            if(req.data){
                alert(req.data);
            }
            else{
                alert("Error")
            }
                
    }
    return (
        <div>
            <h1>SignUp</h1>
            <div>
                <form onSubmit={addNewEmployee}>
                    <label htmlFor="name">Name  </label>
                    <input id="name" name="name" type="text" onChange={(e) => setName(e.target.value)} />
                    <br />
                    <br/>
                    <label htmlFor="email">Email </label>
                    <input id="email" name="email" type="email" onChange={(e) => setEmail(e.target.value)} />
                    <br />
                    <br/>
                    <label htmlFor="password">Password  </label>
                    <input id="password" name="password" type="password" onChange={(e) => setPassword(e.target.value)} />
                    <br />
                    <br/>
                    <label htmlFor="userName">User Name  </label>
                    <input id="userName" name="userName" type="text" onChange={(e) => setUserName(e.target.value)} />
                    <br />
                    <br/>
                    <label htmlFor="roleName">Role Name  </label>
                    <label>
                    <input
                        id="roleName"                                       
                        type="radio"
                        name="roleName"            
                        value="ROLE_USER"
                        onChange={(e) => setRoleName(e.target.value)}/>ROLE_USER  </label>
                    <label>
                    <input
                        id="roleName"
                        type="radio"
                        name="roleName"
                        value="ROLE_ADMIN"
                        onChange={(e) => setRoleName(e.target.value)}/>ROLE_ADMIN  </label> 
                    <br />
                    <br/>
                    <button type="submit">Sign In</button>
                </form>
            </div>
        </div>
    );
};

export default SignUp;