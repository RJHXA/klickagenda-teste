interface IntervalProps {
    horarioInicio: string, 
    horarioFim: string
}

export function TimeRange({ horarioInicio, horarioFim }: IntervalProps) {

    return(
        <div>
            {horarioInicio} {horarioFim}
        </div>
    )
}