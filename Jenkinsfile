pipeline{
    agent any

    stages{

        stage('Class01'){
            steps{
                    script{
                                if(isUnix(){
                                    sh 'java ./src/Class01.java'
                                }
                                else{
                                    bat 'java ./src/Class01.java'
                                }
                            }

            }
        }
        stage('('Class02')'){
            steps{
                script{
                        if(isUnix()){
                                        sh 'java ./src/Class02.java'
                                    }
                                    else{
                                        bat 'java ./src/Class02.java'
                                    }
            }
        }


        }
        stage('('Class03')'){
            steps{
                script{
                                if( isUnix() ){
                                    sh 'java ./src/Class03.java'
                                }
                                else bat 'java ./src/Class03.java'

                }
            }

            }
    }
}