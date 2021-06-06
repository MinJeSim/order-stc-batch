# batch 프로그램

실행방법
1. BatchApplication 
   - main함수 run 시켜서 실행
   
2. intellij 내 Terminal 창에서 아래 명령어를 실행하여 jar packaging 하기 
   - mvnw install
     
     Error: JAVA_HOME not found in your environment 발생시 'set JAVA_HOME=JDK설치위치' 명령어 수행

3. Terminal에서 target 폴더로 이동 후 아래 명령어 실행하여 배치 실행 가능
   - java -jar demo-0.0.1-SNAPSHOT.jar ExampleBatchService 0
   
     마지막 파라미터의 경우 0~4까지 입력가능, 입력한 숫자에 맞는 ExampleBatchService 서비스 수행.

   

