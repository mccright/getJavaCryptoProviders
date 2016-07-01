# getJavaCryptoProviders
Sometimes it is important to verify what providers are available in the current environment  

>The meat The meat of JCEProviders is from:  
>[https://stackoverflow.com/questions/3683302/how-to-find-out-what-algorithm-encryption-are-supported-by-my-jvm](https://stackoverflow.com/questions/3683302/how-to-find-out-what-algorithm-encryption-are-supported-by-my-jvm),  
>and ListProviders is from:  
>[http://www.java2s.com/Code/Java/Security/ListAllProviderAndItsAlgorithms.htm](http://www.java2s.com/Code/Java/Security/ListAllProviderAndItsAlgorithms.htm)  

This code will list out the various crypto providers available to you.  
It can be useful for a range of purposes.  For example, use it when you can't remember the exact string identifying the signature algorithm you want to use.  

These little programs spill a lot of information to the screen.  I usually reduce the output with grep, like:  

```
java ListProviders | grep -i keystore  
        KeyStore.JKS  
        KeyStore.CaseExactJKS  
        KeyStore.JKS ImplementedIn  
        KeyStore.DKS  
        KeyStore.PKCS12  
        KeyStore.JCEKS  
        KeyStore.Windows-ROOT  
        KeyStore.Windows-MY  
``` 

```
java JCEProviders | grep -i keystore  
        SUN: KeyStore.JKS -> sun.security.provider.JavaKeyStore$DualFormatJKS  
        SUN: KeyStore.CaseExactJKS -> sun.security.provider.JavaKeyStore$CaseExactJKS  
        SUN: KeyStore.DKS -> sun.security.provider.DomainKeyStore$DKS  
        SunJSSE: KeyStore.PKCS12 -> sun.security.pkcs12.PKCS12KeyStore  
        SunJCE: KeyStore.JCEKS -> com.sun.crypto.provider.JceKeyStore  
        SunMSCAPI: KeyStore.Windows-MY -> sun.security.mscapi.KeyStore$MY  
        SunMSCAPI: KeyStore.Windows-ROOT -> sun.security.mscapi.KeyStore$ROOT  
```

