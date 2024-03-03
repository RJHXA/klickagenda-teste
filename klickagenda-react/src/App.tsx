import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import './App.css'
import { CardGrid } from './components/CardGrid/CardGrid'
import { UserDetail } from './components/UserDetail/UserDetail';

function App() {

  return (
    <>
    <Router>
      <Routes>
        <Route path='/' element={ <div className='container'> <CardGrid></CardGrid> </div> }/>

        <Route path="/user/:userId" element={ <div className='container'> <UserDetail></UserDetail> </div> } />

      </Routes>
    </Router>
    </>
  )
}

export default App