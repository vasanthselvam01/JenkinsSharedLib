def call(){
  sh 'echo Hi, this is shared library from jenkins'
}
env.SERVICE = 'test'
env.VAR1 = 'value'
