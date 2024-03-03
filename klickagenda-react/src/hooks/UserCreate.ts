import { useMutation, useQueryClient } from '@tanstack/react-query'
import { User } from "../common/User";
import { ApiController } from "../controller/ApiController";

export function UserCreate() {

    const postData = async(data: User) => ApiController.post<any>('/usuario', data)

    const queryClient = useQueryClient();

    const mutate = useMutation({
        mutationFn: postData,
        retry: 2,
        onSuccess: () => {
            queryClient.invalidateQueries({queryKey: ['user-data']});
        }
    })

    return mutate;
}