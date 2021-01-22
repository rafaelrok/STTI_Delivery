import { BrowserRouter } from 'react-router-dom';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import './App.css';
import Routes from './Routes';
//import Signin from './Signin';


function App() {
  return (
    <>
      <BrowserRouter>
          <Routes />
          <ToastContainer />
      </BrowserRouter>

      </>
  );
}

export default App;
