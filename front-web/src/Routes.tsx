import { BrowserRouter, Route, Switch } from "react-router-dom";
//import Footer from "./Footer";
import Home from "./Home";
//import Navbar from "./Navbar";
import Orders from "./Orders";
import SignIn from "./Signin"
import SignUp from "./SignUp";


function Routes() {
    return (
        <BrowserRouter>
                 <Switch>
                    <Route path="/signup">
                        <SignUp />
                    </Route>
                    <Route path="/signin">
                        <SignIn />
                    </Route> 
                    <Route path="/orders">
                        <Orders />
                    </Route>
                    <Route path="/">
                        <Home />
                    </Route>   
                 </Switch>
         </BrowserRouter>  
    )
}

export default Routes;