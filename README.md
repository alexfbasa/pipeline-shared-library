# pipeline-shared-library
Para usar a shared library você tem que configurar ela no jenkins, em configurações globais:
![setup_shared_lib.png](/images/setup_shared_lib.png)

Para usar outra branch no Shared Library apenas adicione o nome ao final com arroba ao final
  ```
  @Library("pipeline-shared-library@"branch_name") _
  ```
