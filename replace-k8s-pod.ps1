kubectl delete -f kubernetes\registry
kubectl delete -f kubernetes\catalog
kubectl delete -f kubernetes\contoso
kubectl delete -f kubernetes\number
kubectl delete -f kubernetes\uaa

kubectl apply -f kubernetes\registry
kubectl apply -f kubernetes\catalog
kubectl apply -f kubernetes\contoso
kubectl apply -f kubernetes\number
kubectl apply -f kubernetes\uaa

