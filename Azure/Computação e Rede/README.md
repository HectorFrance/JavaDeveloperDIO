<div align="center">
  <h1>- Computação e Redes -</h1>
</div>

# Criação de uma Máquina Virtual no Azure

Ao criar uma VM na Azure, é preciso escolher:

- O **grupo de recursos** ao qual ela pertence.
- A **região** que ela irá pertencer.
- Sua **zona de disponibilidade**, com 3 opções:

  - **Zona de disponibilidade**: permite selecionar entre as 3 zonas conhecidas.
  - **Conjunto de dimensionamento**: permite definir propriedades de escalonamento.
  - **Conjunto de disponibilidade**: garante alta disponibilidade de VM dentro de um mesmo datacenter.
  - **Nenhum**

Também é preciso escolher o **tamanho da VM**.  
Existe uma grande variedade de tamanhos, com **categorias de serviços** que separam as famílias de acordo com o propósito para o qual cada uma foi pensada, possibilitando uma **ampla escolha de propósito e tamanho** para as VMs.

---

## Disco


Após ter sido escolhido as características e imagem da VM, seguimos para as **opções de disco**, onde podemos escolher:

- O **tipo de disco**
- O **tamanho** do disco

---

## Rede

Na parte de rede, definimos nossa rede virtual.  
Caso já exista uma rede na mesma região em que está sendo criada a VM, é possível reutilizá-la.

---

## Gerenciamento

Continuando o fluxo de criação, vamos para a parte de **gerenciamento**, onde podemos habilitar funções como:

- Desligamento automático em determinado horário
- Backup

---

## Monitoramento

Na seção de **monitoramento**, podemos definir:

- Alertas
- Diagnósticos  
(de acordo com a necessidade ou preferência)

---

## Opções Avançadas

Nas **opções avançadas**, é possível:

- Instalar **extensões na VM ao iniciar**
- Instalar **aplicativos de VM**

---

## Marcas (Tags)

Por último, temos a tela de **Marcas (Tags)**, onde podemos:

- Atribuir **tags** para classificar os recursos

Após isso, podemos **revisar as propriedades da VM** escolhidas e então **criá-la**.
