import { User } from "./User"
import { AvailiabilityId } from "./AvailiabilityId"

export interface Availiability {
    id: AvailiabilityId,
    usuario: User,
    dia_semana: string
}