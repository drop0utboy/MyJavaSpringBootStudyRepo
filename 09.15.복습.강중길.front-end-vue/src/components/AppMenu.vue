<!-- 컴포넌트의 UI -->
<template>
  <div class="accordion" id="accordionExample">
    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse1"
          aria-expanded="true"
          aria-controls="collapse1"
        >
          Ch01. Vue 시작
        </button>
      </h2>
      <div
        id="collapse1"
        class="accordion-collapse collapse show"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body">
          <ul>
            <li><RouterLink to="/">HomeView</RouterLink></li>
            <li><RouterLink to="/about">HomeAbout</RouterLink></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button collapsed"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse2"
          aria-expanded="false"
          aria-controls="collapse2"
        >
          Accordion Item #2
        </button>
      </h2>
      <div
        id="collapse2"
        class="accordion-collapse collapse"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body"></div>
          <ul>
            <li><RouterLink to="/Ch02ComponentRouting/Exam01SingleFileComponent">Exam01SingleFileComponent</RouterLink></li>
            <li><RouterLink to="/Ch02ComponentRouting/Exam02FolderComponent">Exam02FolderComponent</RouterLink></li>
            <li><RouterLink to="/Ch02ComponentRouting/Exam03UseUIComponent">Exam03UseUIComponent</RouterLink></li>
            <li><RouterLink to="/Ch02ComponentRouting/Exam04ViewNavigation">Exam04ViewNavigation</RouterLink></li>
            <li><RouterLink to="/Ch02ComponentRouting/Exam05NestedRoute">Exam05NestedRoute</RouterLink></li>

            <li><RouterLink to="/Ch02ComponentRouting/Exam06URLDataSend">Exam06URLDataSend</RouterLink></li>
            <!-- <li><RouterLink to="/Ch02ComponentRouting/Exam06URLDataRecieve">Exam06URLDataRecieve</RouterLink></li> -->
          </ul>
      </div>
    </div>

    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button collapsed"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse3"
          aria-expanded="false"
          aria-controls="collapse3"
        >
          CH03 DataBinding
        </button>
      </h2>
      <div
        id="collapse3"
        class="accordion-collapse collapse"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body"></div>
          <ul>
            <li><RouterLink to="/Ch03DataBinding/Exam01Expressions">Exam01Expressions</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam02NotState">Exam02NotState</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam03State">Exam03State</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam04ComputedFunBinding">Exam04ComputedFunBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam05AttrBinding">Exam05AttrBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam06InnerHtmlBinding">Exam06InnerHtmlBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam07IfShowBinding">Exam07IfShowBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam08RepeatBinding">Exam08RepeatBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam09FormBinding">Exam09FormBinding</RouterLink></li>
          </ul>
      </div>
    </div>

    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button collapsed"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse4"
          aria-expanded="false"
          aria-controls="collapse4"
        >
          CH04 EventHandlingWatch
        </button>
      </h2>
      <div
        id="collapse4"
        class="accordion-collapse collapse"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body"></div>
          <ul>
            <li><RouterLink to="/Ch04EventHandlingWatch/Exam01EventHandling">Exam01EventHandling</RouterLink></li>
            <li><RouterLink to="/Ch04EventHandlingWatch/Exam02Watch">Exam02Watch</RouterLink></li>
            
          </ul>
      </div>
    </div>

    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button collapsed"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse5"
          aria-expanded="false"
          aria-controls="collapse5"
        >
          CH05 DataDelivery
        </button>
      </h2>
      <div
        id="collapse5"
        class="accordion-collapse collapse"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body"></div>
          <ul>
            <li><RouterLink to="/Ch05DataDelivery/Exam01FallthroughAttr">Exam01FallthroughAttr</RouterLink></li>
            <li><RouterLink to="/Ch05DataDelivery/Exam02Props">Exam02Props</RouterLink></li>
            <li><RouterLink to="/Ch05DataDelivery/Exam03EventEmit">Exam03EventEmit</RouterLink></li>
            <li><RouterLink to="/Ch05DataDelivery/Exam04UseAttr">Exam04UseAttr</RouterLink></li>
            <li><RouterLink to="/Ch05DataDelivery/Exam05ProvideInject">Exam05ProvideInject</RouterLink></li>
            
          </ul>
      </div>
    </div>

    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button collapsed"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse6"
          aria-expanded="false"
          aria-controls="collapse6"
        >
          CH06 LifecycleHook
        </button>
      </h2>
      <div
        id="collapse6"
        class="accordion-collapse collapse"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body"></div>
          <ul>
            <li><RouterLink to="/Ch06LifecycleHook/Exam01LifeCycleHooks">Exam01LifeCycleHooks</RouterLink></li>
            
          </ul>
      </div>
    </div>

    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button collapsed"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse7"
          aria-expanded="false"
          aria-controls="collapse7"
        >
          CH07 Global State
        </button>
      </h2>
      <div
        id="collapse7"
        class="accordion-collapse collapse"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body"></div>
          <ul>
            <li><RouterLink to="/Ch07GlobalState/Exam01RootState">Exam01RootState</RouterLink></li>
            <li><RouterLink to="/Ch07GlobalState/Exam02CounterState">Exam02CounterState</RouterLink></li>
          </ul>
      </div>
    </div>

     <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button collapsed"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse8"
          aria-expanded="false"
          aria-controls="collapse8"
        >
          CH08 Rest API
        </button>
      </h2>
      <div
        id="collapse8"
        class="accordion-collapse collapse"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body"></div>
          <ul>
            <li><RouterLink to="/Ch08RestAPI/Exam01Join">Exam01Join</RouterLink></li>
            <li><RouterLink to="/Ch08RestAPI/Exam02Login">Exam02Login</RouterLink></li>
            <li><RouterLink to="/Ch08RestAPI/Exam03Board/BoardList">Exam03Board</RouterLink></li>
            <!-- <li><RouterLink to="/Ch08RestAPI/Exam02CounterState">Exam02CounterState</RouterLink></li> -->
          </ul>
      </div>
    </div>


  </div>
</template>

<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup></script>

<!-- 컴포넌트의 스타일 정의 -->
<style scoped></style>
