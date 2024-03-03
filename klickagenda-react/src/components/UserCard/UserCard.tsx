import { Link } from 'react-router-dom';
import './UserCard.css'

interface UserCardPrpos {
    id: number,
    nome: string
}

export function UserCard({ id, nome }: UserCardPrpos) {

    return(
        <div className="card">
            <Link to = {`/user/${id}`}>
                <p>{nome}</p>
            </Link>
        </div>
    )
}