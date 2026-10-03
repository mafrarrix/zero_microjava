# Memoria di progetto

`zero_microjava` è uno starter Maven per microservizi Spring Boot, coordinate `com.github.mafrarrix:zero_microjava` (`1.0.0-SNAPSHOT`). Il progetto usa Spring Boot `4.1.1`, Kotlin `2.4.20` e target Java `17`; il parent Spring Boot gestisce le versioni delle dipendenze.

Il `pom.xml` configura Kotlin Maven con il plugin `spring` (all-open) e include Spring MVC, Actuator e Jackson 3 con supporto Kotlin, oltre alle dipendenze di test. L’entry point è `src/main/kotlin/com/github/mafrarrix/zeromicrojava/ZeroMicrojavaApplication.kt`. Non risultano altre classi o test al momento.

Verifica build eseguita con `mvn -U clean verify`: successo. Branch Git osservato all’inizializzazione: `switch_kotolin`.
