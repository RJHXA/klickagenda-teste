import { AvailiabilityCard } from '../AvailiabilityCard/AvailiabilityCard'
import { AvailiabilityHook } from '../../hooks/AvailiabilityHook';
import { useParams } from 'react-router-dom';
import { UserHook, UserHookFilter } from '../../hooks/UserHook';

interface UserProps{
    id:number,
    nome: string
}

export function UserDetail() {

    const { userId } = useParams();

    console.log(userId);

    const { data } = AvailiabilityHook(Number(userId));

    const user = UserHookFilter(Number(userId));
    console.log(user.data?.nome);

    return(
        <div>
            <h1>Detalhes {user.data?.nome}</h1>
            {data?.map(availiability => 
                    <AvailiabilityCard 
                        key={availiability.id.toString()}
                        id= {availiability.id}
                        usuario={{ id: Number(userId), nome: user.data?.nome}}
                        dia_semana= {availiability.dia_semana}
                    />
                )}
        </div>
    )
}