addConexion(belice,guatemala,1).
addConexion(guatemala,belice,1).
addConexion(belice,honduras,2).
addConexion(costa_rica,belice,5).
addConexion(belice,panama,6).
addConexion(panama,belice,6).

addConexion(guatemala,honduras,1).
addConexion(costa_rica,guatemala,4).
addConexion(guatemala,panama,5).
addConexion(panama,guatemala,5).

addConexion(honduras,salvador,1).
addConexion(salvador,honduras,1).
addConexion(honduras,nicaragua,1).
addConexion(panama,honduras,3).

addConexion(salvador,nicaragua,2).
addConexion(nicaragua,salvador,2).
addConexion(salvador,costa_rica,3).
addConexion(panama,salvador,4).

addConexion(nicaragua,costa_rica,1).
addConexion(costa_rica,nicaragua,1).
addConexion(nicaragua,panama,2).
addConexion(panama,nicaragua,2).

addConexion(costa_rica,panama,1).
addConexion(panama,costa_rica,1).


ruta(X,X,[X],_).
ruta(Inicio,Final,[Inicio|Respuesta],ListaTemp):- addConexion(Inicio,X,_),
        not(member(X,ListaTemp)),
        ruta(X,Final,Respuesta,[Inicio|ListaTemp]).


prueba(_,[]).
                %listaEscala
prueba(ListaRuta,[Head|Tail]):-member(Head,ListaRuta),prueba(ListaRuta,Tail).


pesoRuta([_|[]],_,0).
pesoRuta([Head|Tail],[_|[Tail1|_]],Peso):-addConexion(Head,Tail1,P1),pesoRuta(Tail,Tail,Pt),Peso is P1+Pt.


rutaValidated(Inicio,Final,Escalas,ListaTotales):-ruta(Inicio,Final,Ruta,[]),
        prueba(Ruta,Escalas),pesoRuta(Ruta,Ruta,PesoRuta),append([PesoRuta],Ruta,ListaTotales).

mejorPeso([],ListaPesos,MejorPeso):-min_list(ListaPesos,MejorPeso).
                 %listaRutas    %almacenaPesos %menorPeso
mejorPeso([[Head|_]|Tail],ListaPesos,MejorPeso):-mejorPeso(Tail,[Head|ListaPesos],MejorPeso).

mejorRuta([],_,MejorRuta,Ruta):-append(MejorRuta,[],Ruta).
          %listaRutas              %mejorRuta
mejorRuta([Head|Tail],MejorPeso,MejorRuta,Ruta):-
        (member(MejorPeso,Head)
        ->mejorRuta([],_,Head,Ruta)
        ;mejorRuta(Tail,MejorPeso,MejorRuta,Ruta)).



mainMethod(Inicio,Final,ListaEscalas,ListaTotales,MejorRuta):-
        findall(Ruta,rutaValidated(Inicio,Final,ListaEscalas,Ruta),ListaTotales),mejorPeso(ListaTotales,[],MejorPeso),mejorRuta(ListaTotales,MejorPeso,[],MejorRuta).
