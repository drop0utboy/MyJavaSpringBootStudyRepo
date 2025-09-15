<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">

    </div>
    <div class="card-body">
      <!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->
      <div class="row mb-2">
        <label class="col-sm-2 col-form-label">UserId</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" v-model="userId">
        </div>
      </div>

      <!-- <div class="row mb-2">
        <label class="col-sm-2 col-form-label">ProductId</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" v-model="productId">
        </div>
      </div> -->

      <div>
        <button class='btn btn-info btn-sm' @click='handleChangeProduct()'>product 객체 변경</button>
        <button class='btn btn-info btn-sm' @click='handleChangeProperty()'>product 속성 변경</button>
      </div>

    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref, watch } from 'vue';


const userId = ref("");

// 상태 변경 감시
watch(userId, (newUserId, oldUserId) => {
  console.group("userId 변경감시 ");
  console.log("새유저:", newUserId);
  console.log("기존유저:", oldUserId);
  console.groupEnd();
}

);



const product = ref({
  name: "제네시스",
  company: "현대",
  price: 80000000
})

function handleChangeProduct() {
  product.value = {
  name: "람보르기니",
  company: "이탈리아 회사",
  price: 9999999999999999999
}}

function handleChangeProperty() {
  product.value.price = 1000000;
}


// 상태가 객체일 경우 감시(객체 자체 변경, 객체 내부 속성 변경)
watch(product, (newProduct, oldProduct) => {
  console.group("product 변경감시 ");
  console.log("새제품:", structuredClone(newProduct));
  console.log("기존제품:", structuredClone(oldProduct));
  console.groupEnd();
}, {deep: true}
);


// 속성 자체를 감시대상으로 할 수는 없으나 람다식으로 주면 가능하다
watch(()=>{return product.value.price}, (newProduct, oldProduct) => {
  console.group("product 가격 속성 변경만 감시변경감시 ");
  console.log("새제품:", structuredClone(newProduct));
  console.log("기존제품:", structuredClone(oldProduct));
  console.groupEnd();
});

// structuredClone() -> 상태 객체등을 js객체로 바꾸는데 씀 그래야 stringify해서 json으로 바꿔 넘기기 쉽기 때문

// 여러개의 상태를 감시 할 경우
watch([userId, product], ([newValue, oldValue],[newProduct, oldProduct]) => {});



</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>