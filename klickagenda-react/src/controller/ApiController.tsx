import axios, { AxiosInstance, AxiosResponse } from 'axios';

class ApiController {

  private static http: AxiosInstance = axios.create({
    baseURL: 'http://localhost:8080/',
    timeout: 10000,
    headers: {
      'Content-Type': 'application/json',
    },
  });

  // Método estático para a solicitação GET
  public static async get<T>(path: string, params?: any): Promise<AxiosResponse<T>> {
    // Realiza a solicitação GET para a rota path com os parâmetros (se existirem)
    return ApiController.http.get<T>(path, { params });
  }

  // Método estático para a solicitação POST
  public static async post<T>(path: string, data: any): Promise<AxiosResponse<T>> {
    // Realiza a solicitação POST para a rota path com os dados informados no corpo da solicitação
    return ApiController.http.post<T>(path, data);
  }

  // Método estático para a solicitação PUT
  public static async put<T>(path: string, data: any): Promise<AxiosResponse<T>> {
    // Realiza a solicitação PUT para a rota path com os dados informados no corpo da solicitação
    return ApiController.http.put<T>(path, data);
  }

  // Método estático para a solicitação DELETE
  public static async delete<T>(path: string): Promise<AxiosResponse<T>> {
    // Realiza a solicitação DELETE para a rota path
    return ApiController.http.delete<T>(path);
  }
}

// Exporta a classe InserirQuadraApi como padrão para ser importada em outros arquivos
export {ApiController}