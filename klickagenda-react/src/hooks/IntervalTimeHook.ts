import { useQuery } from '@tanstack/react-query'
import { ApiController } from "../controller/ApiController";
import { Interval } from '../common/Interval';

export function IntervalTimeHook( userId : number, key_day: number) {

    const response = async() => ApiController.get<Interval []>('/intervalo/'+userId+'/'+key_day)

    const query = useQuery({
        queryFn: response,
        queryKey: ['interval-data'],
        retry: 2
    })

    return {
        ...query,
        data: query.data?.data
    }
}