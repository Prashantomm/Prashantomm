console.log("app start")
async function getData(){
    var x = await fetch('https://636c62baad62451f9fc8e23b.mockapi.io/products');
    var data = await x.json();

    table(data);
   console.log(data)
  }
  getData()
  let main =document.querySelector("#main")

function table(cardData) {
    main.innerHTML=`
  
    ${cardData
      .map((item) => {
     
        let name = `${item.proname}`;
     
        let id=`${item.id}`;
        let price=`${item.price}`
        let Status=""
        let color=""
        if (item.id%3==0){
            Status="No Sales"
            color="Red"
        }
        else if(item.id%5==0){
            Status="Average Sales"
            color="orange"
        }  else{
            Status="High Demand"
            color="green"
        }
        return getAsCard( name,id,price,Status,color );
      })
      .join("")}
`;
}

function getAsCard(name,id,price,status,color ) {
 
  return `
  <div class="body" >
        <div>${id}</div>
        <div>${name}</div>
        <div>${price}</div>
        <div style=" background-color:${color}" class="status">${status}</div>
      </div>
`;
}