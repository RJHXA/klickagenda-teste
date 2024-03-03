import { TimeRange } from '../TimeRange/TimeRange'
import { IntervalTimeHook } from '../../hooks/IntervalTimeHook';

interface UserProps{
    id:number,
    nome: string | undefined
}

interface AvailiabilityIdProps {
    chave_dia: number,
    usuario_id: number
}

interface AvailiabilityCardProps {
    id: AvailiabilityIdProps,
    usuario: UserProps,
    dia_semana: string
}

export function AvailiabilityCard( { id, usuario, dia_semana}: AvailiabilityCardProps ) {

    const { data } = IntervalTimeHook(id.usuario_id, id.chave_dia);

    return(
        <div>
            <h2>{id.chave_dia} {id.usuario_id}</h2>
            <h2>{dia_semana}</h2>
            {data?.map(interval => 
                    <TimeRange 
                        horarioInicio={interval.horarioInicio}
                        horarioFim={interval.horarioFim}
                    />
                )}
        </div>
    )
}