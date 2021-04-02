
const setStaticJson = async function() {
  let staticJson = await fetch("http://localhost:8080/api/albums", {
    method: "GET",
  }).then(response => response.json())
  
  return staticJson;  
}

 
 






export { setStaticJson };
