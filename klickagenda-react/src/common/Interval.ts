import { Availiability } from "./Availiability";

export interface Interval {
    id: number,
    disponibilidade: Availiability,
    horarioInicio: string,
    horarioFim: string
}