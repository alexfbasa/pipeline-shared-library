# pipeline-shared-library
Para usar a shared library você tem que configurar ela no jenkins, em configurações globais:
![setup_shared_lib.png](/images/setup_shared_lib.png)

Para usar outra branch no Shared Library apenas adicione o nome ao final com arroba ao final
  ```
  @Library(pipeline-shared-library@"branch_name") _
  ```
Ou com diferente sintax:
  ```
  library pipeline-shared-library@"branch_name" _
  ```
Para usar multiplas branchs:
  ```
  @Library(['pipeline-shared-library', 'pipeline-shared-library-other']) _
  ```