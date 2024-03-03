import './CardGrid.css'
import { UserCard  } from '../UserCard/UserCard';
import { UserHook } from '../../hooks/UserHook';
import { useState } from 'react';
import { CreateModal } from '../CreateModal/CreateModal';

export function CardGrid() {

    const { data } = UserHook();
    const[isModalOpen, setIsModalOpen] = useState(false);

    const openModal = () => {
        setIsModalOpen(prev => !prev)
    }

    return(
        <div className='homePage'>
            <h1>List Users</h1>
            <button onClick={ openModal } className='create-user-button'>Novo</button>

            <div className="card-grip">
                {data?.map(user => 
                    <UserCard 
                        id={user.id}
                        nome={user.nome}
                    />
                )}

                {isModalOpen && <CreateModal closeModal={ openModal }/>}
            </div>
        </div>
    )
}