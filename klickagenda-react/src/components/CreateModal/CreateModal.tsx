import React, { useEffect, useState } from 'react'
import { UserCreate } from '../../hooks/UserCreate';
import { User } from '../../common/User';
import "./CreateModal.css"

interface InputProps {
    label: string,
    value: string | number,
    updateValue(value: any): void
}

interface ModalProps {
    closeModal() : void
}

const Input = ({ label, value, updateValue }: InputProps) => {
    return (
        <>
            <label>{ label }</label>
            <input value={ value } onChange={ event => updateValue(event.target.value) }></input>
        </>
    )
}


export function CreateModal({ closeModal } : ModalProps) {

    const [nome, setNome] = useState("");

    const { mutate, isSuccess } = UserCreate();

    const submit = () => {
        const user: User = {
            nome
        }

        mutate(user)
    }

    useEffect(() => {
        if(!isSuccess) return
        closeModal();
    }, [isSuccess])

    return(
        <div className='modal-overlay'>
            <div className='modal-body'>
                <h2>Cadastre um novo Usuário</h2>
                <form className='input-container'>
                    <Input label="nome" value={ nome } updateValue={ setNome }></Input>
                </form>
                <button onClick={ submit } className='btn-secondary'>Novo</button>
            </div>
        </div>
    )
}