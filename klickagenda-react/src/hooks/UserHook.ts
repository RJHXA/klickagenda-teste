import { useQuery } from '@tanstack/react-query'
import { User } from "../common/User";
import { ApiController } from "../controller/ApiController";

export function UserHook() {

    const response = async() => ApiController.get<User []>('/usuario')

    const query = useQuery({
        queryFn: response,
        queryKey: ['user-data'],
        retry: 2
    })

    return {
        ...query,
        data: query.data?.data
    }
}

export function UserHookFilter(id: number) {
    const response = async() => ApiController.get<User>('/usuario/' + id)

    const query = useQuery({
        queryFn: response,
        queryKey: ['user-data'],
        retry: 2
    })

    return {
        ...query,
        data: query.data?.data
    }
}