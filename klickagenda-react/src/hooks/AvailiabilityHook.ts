import { useQuery } from '@tanstack/react-query'
import { ApiController } from "../controller/ApiController";
import { Availiability } from '../common/Availiability';

export function AvailiabilityHook(userId : number) {

    const response = async() => ApiController.get<Availiability []>('/disponibilidade/'+userId)

    const query = useQuery({
        queryFn: response,
        queryKey: ['availiability-data'],
        retry: 2
    })

    return {
        ...query,
        data: query.data?.data
    }
}